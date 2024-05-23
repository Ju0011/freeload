package ju00.freeload.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

@Getter
@NoArgsConstructor  //기본 생성자 자동 추가
@Data
@Entity
@Builder
@AllArgsConstructor //this. 대신
@Table(name = "rest")   // 데이터베이스에 REST테이블에 매핑
public class RestEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "svarCd" , unique = true)
    private Long svarCd;      // 휴게소 아이디

    @Setter
    @Column(name = "svarNm", nullable = false)
    private String restNm;  // 휴게소 이름

    @Setter
    @Column(name = "svarAddr")
    private String restAddr;   // 주소

    @Setter
    @Column(name = "gudClssCd")
    private String gudClssCd;   // 상, 하행 구분

    @Setter
    @Column(name = "routeNm")
    private String routeNm;     //휴게소가 소속된 고속도로 이름

    @Setter
    @Column(name = "routeCd")
    private String routeCd;     //휴게소가 소속된 고속도로 코드

    @Setter
    @Column(name = "hdqrCd")    //본부코드
    private String hdqrCd;

}
