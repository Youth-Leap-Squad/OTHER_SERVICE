package com.eat.today.event.worldcup.command.application.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="worldcup_join_member")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class WorldcupJoinMember {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "worldcup_join_member_no", nullable = false)
    private int worldcupJoinMemberNo;

    @Column(name = "worldcup_no", nullable = false)
    private int worldcupNo;

    @Column(name = "member_no", nullable = false)
    private int memberNo;

}
