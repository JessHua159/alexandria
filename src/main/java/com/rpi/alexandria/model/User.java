package com.rpi.alexandria.model;

import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;

@Container(containerName = "user")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

	@Id
	private String username;

	private String firstName;

	@PartitionKey
	private String lastName;

	private String address;

}
