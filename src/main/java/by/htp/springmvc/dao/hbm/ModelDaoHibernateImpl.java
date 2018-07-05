package by.htp.springmvc.dao.hbm;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

import by.htp.springmvc.dao.domain.Car;
import by.htp.springmvc.model.FormModel;


public class ModelDaoHibernateImpl {

	public String search(int id) {
		Session session = SessionFactoryManager
				.getSessionFactory().openSession();
		session.beginTransaction();
		FormModel model = (FormModel) session.load(FormModel.class, 1);
		return model.getName();
	}

	
	public Car read(int id) {
		Session session = SessionFactoryManager
				.getSessionFactory().openSession();
		Car car = (Car) session.get(Car.class, id);
		return car;
	}

	
	public List<Car> readAll() {
		Session session = SessionFactoryManager
				.getSessionFactory().openSession();
		
		Criteria criteria = session.createCriteria(Car.class);
		return criteria.list();
	}

	
	public void update(Car entity) {
		// TODO Auto-generated method stub
		
	}

}
