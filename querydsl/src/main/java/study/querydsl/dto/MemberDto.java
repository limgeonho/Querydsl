package study.querydsl.dto;

import com.querydsl.core.annotations.QueryProjection;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MemberDto { // 내가 보내고 싶은 데이터만 보낼 수 있는 통이라고 생각하면 됨.

    private String username;
    private int age;

    @QueryProjection
    public MemberDto(String username, int age){
        this.username = username;
        this.age = age;
    }
}
