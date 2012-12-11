package com.tmcelrea.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.sql.Date;

import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

import com.tmcelrea.example.model.Album;
import com.tmcelrea.example.model.Book;
import com.tmcelrea.example.model.ThingSomeoneMade;

@ContextConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
public class ThingPersistenceTests {

	@Autowired
	private SessionFactory sessionFactory;

	@Test
	@Transactional
	public void testSaveAlbum() throws Exception {
		Session session = sessionFactory.getCurrentSession();
		Album album = new Album();
		album.setReleaseDate(new Date(System.currentTimeMillis()));
		album.setThingType("ALBUM");
		album.setTitle("GANGHAM STYLE");
		album.setArtistName("PSY");
		album.setGenre("BAROQUE");
		album.setLabel("SONY");
		session.save(album);
		session.flush();
		assertNotNull(album.getThingId());
	}

	@Test
	@Transactional
	public void testSaveBook() throws Exception {
		Session session = sessionFactory.getCurrentSession();
		Book book = new Book();
		book.setReleaseDate(new Date(System.currentTimeMillis()));
		book.setThingType("BOOK");
		book.setTitle("GRAVITY'S RAINBOW");
		book.setAuthor("THOMAS PYNCHON");
		book.setPublsiher("SCRIBNERS");
	    book.setCategory("MANIC");
		session.save(book);
		session.flush();
		assertNotNull(book.getThingId());
	}
	
	@Test
	@Transactional
	public void testGetThingsSomeoneMade() {
		Session session = sessionFactory.getCurrentSession();
		
		Album album = new Album();
		album.setReleaseDate(new Date(System.currentTimeMillis()));
		album.setThingType("ALBUM");
		album.setTitle("GANGHAM STYLE");
		album.setArtistName("PSY");
		album.setGenre("BAROQUE");
		album.setLabel("SONY");
		session.save(album);
		session.flush();
		
		Book book = new Book();
		book.setReleaseDate(new Date(System.currentTimeMillis()));
		book.setThingType("BOOK");
		book.setTitle("GRAVITY'S RAINBOW");
		book.setAuthor("THOMAS PYNCHON");
		book.setPublsiher("SCRIBNERS");
	    book.setCategory("MANIC");
		session.save(book);
		session.flush();
		
		List<ThingSomeoneMade> things = (List<ThingSomeoneMade>)session.createQuery("FROM ThingSomeoneMade t").list();
		System.out.println(things.size());
	}

}
