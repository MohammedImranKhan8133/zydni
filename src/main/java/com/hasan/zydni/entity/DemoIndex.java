package com.hasan.zydni.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
    public class DemoIndex {
        @Id
        private int indexId;

        @OneToOne
        private User user;
}