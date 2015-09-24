package edu.starterkit.dao.impl;

import java.util.List;

import edu.starterkit.dao.BookDao;
import edu.starterkit.qualifiers.HibernateImpl;
import edu.starterkit.to.BookTo;

@HibernateImpl
public class BookDaoHibernateImpl implements BookDao {

	@Override
	public List<BookTo> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BookTo> findBookByTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BookTo> findBooksByAuthor(String author) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BookTo save(BookTo book) {
		// TODO Auto-generated method stub
		return null;
	}

}
