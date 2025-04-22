package main.java.entity;

// Entity
// : 데이터베이스 테이블과 매핑되는 클래스
// >> 1:1

import lombok.*;

// +) Lombok
//    : Java Domain에서 반복적으로 작성되는 getter나 setter, 생성자 관련 코드 등을
//      , 간결하게 만들어주는 라이브러리
//    1) Lombok 플러그인 설치
//    2) Dependency 설정
//       : compileOnly 'org.projectlombok:lombok:1.18.38'
//    3) Enable annotation 설정

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Member {
    private int id;
    private String name;
    private String email;

//    public Member(int id, String name, String email) {
//        this.id = id;
//        this.name = name;
//        this.email = email;
//    }
//
//    public int getId() { return id; }
//    public String getName() { return name; }
//    public String getEmail() { return email; }
}