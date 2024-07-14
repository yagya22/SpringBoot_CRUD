package com.example.Enotes.service;

import com.example.Enotes.entity.Notes;
import com.example.Enotes.entity.User;

import java.util.List;
public interface NotesService {
	public Notes saveNotes(Notes notes);
	
	public Notes getNotesById(int id);
	
	public List<Notes> getNotesByUser(User user);
	
	public Notes updateNotes(Notes notes);
	
	public boolean deleteNotes(int id);
	

}
