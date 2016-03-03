package com.apsiton.web.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


public class UserVO implements Serializable {

	private static final long serialVersionUID = 3025649200475443291L;

	
	private int id;
	private String userName;
	private String password;
	private String firstName;
	private String lastName;
	private String email;
	private Date lastLogin;
	private Boolean enabled = Boolean.TRUE;
	private Date createDate;
	private String createdBy;
	private Date lastUpdateDate;
	private String lastUpdateUser;
	private Set<UserAuthorityVO> userAuthorities = new HashSet<UserAuthorityVO>(0);

	private Boolean isAdmin = Boolean.FALSE;
	private Boolean isUser = Boolean.FALSE;
	private Boolean isSuperUser = Boolean.FALSE;
	private Boolean isAnonymousUser = Boolean.FALSE;

	public Set<UserAuthorityVO> getUserAuthorities() {
		return userAuthorities;
	}

	/**
	 * @param userAuthorities
	 *            the userAuthorities to set
	 */
	public void setUserAuthorities(Set<UserAuthorityVO> userAuthorities) {
		this.userAuthorities = userAuthorities;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getLastUpdateDate() {
		return lastUpdateDate;
	}

	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	public String getLastUpdateUser() {
		return lastUpdateUser;
	}

	public void setLastUpdateUser(String lastUpdateUser) {
		this.lastUpdateUser = lastUpdateUser;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the createdBy
	 */
	public String getCreatedBy() {
		return createdBy;
	}

	/**
	 * @param createdBy
	 *            the createdBy to set
	 */
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the enabled
	 */
	public Boolean getEnabled() {
		return enabled;
	}

	public Boolean isAdmin() {
		return isAdmin;
	}

	/**
	 * @param isAdmin
	 *            the isAdmin to set
	 */
	public void setAdmin(Boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	/**
	 * @return the isUser
	 */
	public Boolean isUser() {
		return isUser;
	}

	/**
	 * @param isUser
	 *            the isUser to set
	 */
	public void setUser(Boolean isUser) {
		this.isUser = isUser;
	}

	/**
	 * @return the isSuperUser
	 */
	public Boolean isSuperUser() {
		return isSuperUser;
	}

	/**
	 * @param isSuperUser
	 *            the isSuperUser to set
	 */
	public void setSuperUser(Boolean isSuperUser) {
		this.isSuperUser = isSuperUser;
	}

	public Boolean isAnonymousUser() {
		return isAnonymousUser;
	}

	public void setAnonymousUser(Boolean isAnonymousUser) {
		this.isAnonymousUser = isAnonymousUser;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((userName == null) ? 0 : userName.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		UserVO other = (UserVO) obj;
		if (userName == null) {
			if (other.userName != null) {
				return false;
			}
		} else if (!userName.equals(other.userName)) {
			return false;
		}
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [userName=" + userName + "]";
	}

}
