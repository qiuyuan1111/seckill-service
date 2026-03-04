package main.java.com.qiuyuan.seckill_service.common.exception;
public class BizException extends RuntimeException {
    private final int code;

    
    
    public BizException(ErrorCode errorcode) {
        super(errorcode.getMessage());
        this.code = errorcode.getCode();
    }

    public BizException(String message, int code) {
        super(message);
        this.code = code;
    }
    public int getCode() {
        return code;
    }
}
