import org.junit.*;

import static org.assertj.core.api.Assertions.assertThat;

public class MemberTest {

    @Test
    public void memberBuildTest() {
        //given
        String name = "이름";
        String id = "아이디";
        String pw = "비밀번호";
        int phoneNumber = 00000000000;


        //when
        Member member = new Member.MemberBuilder()
                .name(name)
                .id(id)
                .pw(pw)
                .phoneNumber(phoneNumber)
                .build();


        //then
        assertThat(member.getName()).isEqualTo(name);
        assertThat(member.getId()).isEqualTo(id);
        assertThat(member.getPw()).isEqualTo(pw);
        assertThat(member.getPhoneNumber()).isEqualTo(phoneNumber);
        assertThat(member.getGender()).isNull();
        assertThat(member.getAddress()).isNull();
        assertThat(member.getEmail()).isNull();

    }

    @Test
    public void memberBuildTestWithConstructor() {
        //given
        String name = "이름";
        String id = "아이디";
        String pw = "비밀번호";
        int phoneNumber = 00000000000;
        String gender = "M";
        String address = "주소";
        String email = "이메일@이메일";

        //when
        Member member = new Member.MemberBuilder(name, id, pw, phoneNumber)
                .gender(gender)
                .address(address)
                .email(email)
                .build();


        //then
        assertThat(member.getName()).isEqualTo(name);
        assertThat(member.getId()).isEqualTo(id);
        assertThat(member.getPw()).isEqualTo(pw);
        assertThat(member.getPhoneNumber()).isEqualTo(phoneNumber);
        assertThat(member.getGender()).isEqualTo(gender);
        assertThat(member.getAddress()).isEqualTo(address);
        assertThat(member.getEmail()).isEqualTo(email);

    }



}