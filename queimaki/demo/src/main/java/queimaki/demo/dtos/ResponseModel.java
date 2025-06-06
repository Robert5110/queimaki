package queimaki.demo.dtos;

import lombok.Data;
@Data
public class ResponseModel {
    
    private int status;

    private String message;

    public ResponseModel() {
    }

}
