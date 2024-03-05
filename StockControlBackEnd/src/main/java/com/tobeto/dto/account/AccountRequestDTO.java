package com.tobeto.dto.account;

import lombok.Data;

@Data
public class AccountRequestDTO {
	private String oldPassword;
	private String newPassword;
}
