package main.java;

import java.util.Arrays;
import java.util.List;

public class ForLoopTest {


    public static void main(String[] args) {
        Member member1 = new Member("user1",false,20);
        Member member2 = new Member("user2",true,50);
        Member member3 = new Member("user2",true,30);

        List<Member> memberList = Arrays.asList(member1, member2, member3);

        //for loop style
        for(int i = 0; i<memberList.size(); i++){
            Member members = (Member) memberList.get(i);
            System.out.println("getName : "+members.getName());
        }


                                     //java8 stream style
                                    memberList
                                                .stream()
//                                                .filter(c -> c.getName().equals("user1"))//이
                                                .filter(Member::hasOver30Age)//차량 소유 여부 boolean type 가능
                                //                .filter(c -> {
                                //                    try {
                                //                        return c.hasOver30Age();
                                //                    } catch (Exception e) {
                                //                        //handle exception
                                //                    }
                                //                    return false;
                                //                })
                                              //  .collect(Collectors.toList())
                                                 .map(Member::getName)
                                                .forEach(System.out::println);





        // System.out.println("getName : "+returnMember.get(0).ge);

    }

}
