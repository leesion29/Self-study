package com.mysite.sbb.DTO;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class MsgDTO {
    private String from;
    private String to;
    private String text;
}
