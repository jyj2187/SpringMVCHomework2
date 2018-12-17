package kr.ac.hansung.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.hansung.dao.MyClassDAO;
import kr.ac.hansung.model.MyClass;

@Service
public class MyClassService {

	@Autowired
	private MyClassDAO myclassDao;

	public List<MyClass> getCurrent() {
		return myclassDao.getMyclass();
	}

	public List<MyClass> getCurrent2(int year, int semester) {
		List<MyClass> myclass = myclassDao.getMyclassd(year, semester);
		return myclass;
	}

	public void insert(MyClass myclass) {
		myclassDao.insert(myclass);
	}

	/*public void update(MyClass myclass) {
		myclassDao.update(myclass);
	}
	
	public void delete(String classcode) {
		myclassDao.delete(classcode);
	}*/
	
	public List<MyClass> getregisteredclass() {
		return myclassDao.getregisteredclass();
	}

}
