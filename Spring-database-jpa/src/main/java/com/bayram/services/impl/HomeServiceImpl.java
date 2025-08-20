package com.bayram.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bayram.dto.DtoHome;
import com.bayram.dto.DtoRoom;
import com.bayram.entities.Home;
import com.bayram.entities.Room;
import com.bayram.repository.HomeRepository;
import com.bayram.services.IHomeService;

@Service
public class HomeServiceImpl implements IHomeService {

	
	
	@Autowired
	private HomeRepository homeRepository;
	
	
	
	@Override
	public DtoHome findHomeById(long id) {
		
		 DtoHome dtoHome=new DtoHome();
		 DtoRoom dtoRoom =new DtoRoom();
	Optional<Home> optional=homeRepository.findById(id);
		
		if (optional.isEmpty()) {
			return null;
			
		}
	
		 Home dbHome=optional.get();
		 List<Room> dbRooms=optional.get().getRoom();
		 BeanUtils.copyProperties(dbHome, dtoHome);
		 if (dbRooms != null && !dbRooms.isEmpty()) {
			    for (Room room : dbRooms) {
			        DtoRoom dtoRoom1 = new DtoRoom(); // her döngüde yeni nesne
			        BeanUtils.copyProperties(room, dtoRoom1);
			        dtoHome.getRooms().add(dtoRoom1);
			    }
			}

		 return dtoHome;
		
		
	}

	
	
}
