package login.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class loginentity {
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	//private String gender;
	private String emailId;
	private String phoneNumber;
	private String userType;
	private String password;
	private boolean isActive = true;
	private String loginCount; 
	private String ssoType;
	private String loginAt;
	private String createdAt;
	private String updatedAt;




}