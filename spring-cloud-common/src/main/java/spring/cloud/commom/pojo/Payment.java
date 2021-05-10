package spring.cloud.commom.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * 支付信息
 */
@Data
@Builder
@AllArgsConstructor
public class Payment {

    private Long id;

    private String serialId;

    private Integer status;
}
