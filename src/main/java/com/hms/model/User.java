package com.hms.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users_details")
public class User implements Serializable {
	private static final long serialVersionUID = -2559559953523497901L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private Integer userId;
	
//	private String name;
	
//	@Column(nullable = false, unique = true)
//	private String username;
	
	@Column(name = "first_name", length = 15)
	private String firstName;
	
	@Column(name = "last_name", length = 15)
	private String lastName;
	
	@Column(name = "email", nullable = false, unique = true)
	private String email;
	
	@Column(name = "password", nullable = false)
	private String password;
	
	@Column(name = "date_of_birth")
	private LocalDate dateOfBirth;
	
	@Column(name = "mobile_number")
	private Long mobile;
	
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "address_id", referencedColumnName = "address_id")
//	private Location address;
//	
//	@OneToOne(cascade = CascadeType.ALL, mappedBy = "user")
//	private Comment comment;
	
	@JsonManagedReference
	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable(name = "users_roles", 
	joinColumns = @JoinColumn(
			name = "user_id", 
			referencedColumnName = "user_id"), 
	inverseJoinColumns = @JoinColumn(
			name = "role_id", 
			referencedColumnName = "role_id")
	)
	private Set<Role> roles;
	
	@CreationTimestamp
	private LocalDateTime createdDateTime;
	
	@UpdateTimestamp
	private LocalDateTime updatedDateTime;
}