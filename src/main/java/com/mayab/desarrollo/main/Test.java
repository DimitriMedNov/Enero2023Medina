package com.mayab.desarrollo.main;

import com.mayab.desarrollo.persistence.UserDAO;
import com.mayab.desarrollo.servicios.UsuarioServicio;
import org.hibernate.Session;

import com.mayab.desarrollo.entities.Usuario;

import java.util.List;

public class Test {

	public static void main(String[] args) {
		//Add new user object
		Usuario user = new Usuario();
		user.setNombre("USUARIO");
		user.setPassword("1234");
		user.setEmail("email@email.com");
		UserDAO dao= new UserDAO();
		//create User
		int id = dao.createUser(user);
		System.out.println("new user id = "+ id);
		//Find All
		/*List<Usuario> userList = dao.findAll();
		for (Usuario u: userList)
		{
			System.out.println(u.getId());
			System.out.println(u.getNombre());
			System.out.println(u.getEmail());
			System.out.println(u.getPassword());

		}*/
		//find by id
		/*Usuario u2 = dao.findById(1);
		System.out.println(u2.getId());
		System.out.println(u2.getNombre());
		System.out.println(u2.getEmail());
		System.out.println(u2.getPassword());*/
		//delete user
		//System.out.println(dao.deleteUser(5));
		//update pass
		/*Usuario u3= dao.updatePass(user, "tEST");
		System.out.println(u3.getId());
		System.out.println(u3.getNombre());
		System.out.println(u3.getEmail());
		System.out.println(u3.getPassword());*/
		//testing servicios
		//Usuario user2 = new Usuario();
		//user2.setNombre("USUARIO");
		//user2.setPassword("1234");
		//user2.setEmail("test@gmail.com");
		//dao.createUser(user2);
		//test for login from UsuarioServicio
		//UsuarioServicio usuarioServicio = new UsuarioServicio(dao);
		//boolean isLogin = usuarioServicio.login("UsuarioUNICO", "password");
		//System.out.println("Result = "+ isLogin);
		//test for servicio create User
		//boolean isCreated = usuarioServicio.createUser(user2.getNombre(), user2.getPassword(), user2.getEmail());
		//System.out.println("is created =" + isCreated);

	}
}
