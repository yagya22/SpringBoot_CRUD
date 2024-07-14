package com.example.Enotes.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Enotes.entity.Notes;
import com.example.Enotes.entity.User;

public interface NotesRepository extends JpaRepository<Notes ,Integer>{
	
	public List<Notes>findByUser(User user);

}
