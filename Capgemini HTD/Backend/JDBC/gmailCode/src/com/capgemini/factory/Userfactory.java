package com.capgemini.factory;

import com.capgemini.dao.UserImplement;
import com.capgemini.dao.Userdao;

public class Userfactory {
	private Userfactory() {
	}

public static Userdao getDAOInstance() {
	Userdao dao = new UserImplement();
	return dao;
}

}
