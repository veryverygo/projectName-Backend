package kr.co.restful;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
public class UserCreateRequest {
    private String userName;
    private String password;
    private String email;
    private String address;
    private String gender;
    private int age;
    private int height;  // 방금 생긴 코드

}

