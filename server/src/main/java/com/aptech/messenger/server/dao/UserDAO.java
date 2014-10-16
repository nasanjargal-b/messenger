package com.aptech.messenger.server.dao;

import com.aptech.messenger.model.*;

import java.util.ArrayList;

/**
 * Хэрэглэгчийн мэдээллийг агуулах user table-тай харьцах
 * зориулалт бүхий DataAccessObject юм.
 */
public class UserDAO extends DaoSupport {

	/**
	 * Тухайн хэрэглэгчийн нэвтрэх үеийн AuthDetails моделийг дамжуулахад
	 * уг моделиор дамжиж ирсэн мэдээллийг өгөгдөлийн баазаас шүүж таарвал
	 * OwnInfo модельрүү хөрвүүлэн илгээнэ. Хэрэв таараагүй бол UserNotFoundException үүсгэж илгээнэ.
     *
	 * @param authDetails
	 */
	public OwnInfo find(AuthDetails authDetails) {
		// TODO - implement UserDAO.find
		throw new UnsupportedOperationException();
	}

	/**
	 * Уг method-ийг зөвхөн админ хэрэглэгч хэрэглэх бөгөөд өгөгдөлийн
	 * баазад байрлаж буй бүх хэрэглэгчийг шүүж гаргаж ирхэд хэрэглэнэ.
     *
	 * @param filterText уг parameter-ээр дамжиж ирсэн мэдээллийг username,
	 * firstname болон lastname баганаас like коммандын
	 * тусламжтай шүүж харуулна.
	 */
	public ArrayList<RegisterInfo> find(String filterText) {
		// TODO - implement UserDAO.find
		throw new UnsupportedOperationException();
	}

	/**
	 * Хэрэглэгчийн мэдээллийг шинээр үүсгэж хадгалах мөн хэрэв хуучин хэрэглэгч
     * байвал мэдээллийг шинэчлэх зорилготой method юм.
     *
	 * @param registerInfo
	 */
	public void save(RegisterInfo registerInfo) {
		// TODO - implement UserDAO.save
		throw new UnsupportedOperationException();
	}

	/**
	 * Хуучин нууц үгийг солих зориулалт бүхий method юм.
     *
	 * @param changePassword
	 */
	public void changePassword(ChangePasswordInfo changePassword) {
		// TODO - implement UserDAO.changePassword
		throw new UnsupportedOperationException();
	}

}