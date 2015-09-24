package edu.starterkit.service.impl;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;
import javax.interceptor.Interceptor;
import javax.interceptor.Interceptors;

import edu.starterkit.aop.Logger;
import edu.starterkit.aop.LoggerInterceptor;
import edu.starterkit.dao.BookDao;
import edu.starterkit.dao.impl.BookDaoHibernateImpl;
import edu.starterkit.qualifiers.DaoImpl;
import edu.starterkit.qualifiers.HibernateImpl;
import edu.starterkit.service.BookService;
import edu.starterkit.to.BookTo;

public class BookServiceImpl implements BookService {

	@Inject
	@DaoImpl
	private BookDao bookDao;

	@Override @Logger
	public List<BookTo> findAllBooks() {
		return bookDao.findAll();
	}

//	@Interceptors({LoggerInterceptor.class}) inny sposob
	@Override @Logger
	public List<BookTo> findBooksByTitle(String title) {
		return bookDao.findBookByTitle(title);
	}

	@Override @Logger
	public List<BookTo> findBooksByAuthor(String author) {
		return bookDao.findBooksByAuthor(author);
	}

	@Override @Logger
	public BookTo saveBook(BookTo book) {
		return bookDao.save(book);
	}

	public void setBookDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}
}
