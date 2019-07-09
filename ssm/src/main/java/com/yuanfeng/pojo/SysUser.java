/**
 * 
 */
package com.yuanfeng.pojo;

/**
 * @ClassName: SysUser 
 * @Description: TODO
 * @author BRUCELIU
 * @date 2018年11月6日 下午12:03:54 
 */
public class SysUser {

	private Integer id;
	private String username;
	private String password;
	private String salt;
	private Integer locked;
	private Integer del;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public Integer getLocked() {
		return locked;
	}

	public void setLocked(Integer locked) {
		this.locked = locked;
	}

	public Integer getDel() {
		return del;
	}

	public void setDel(Integer del) {
		this.del = del;
	}

}
