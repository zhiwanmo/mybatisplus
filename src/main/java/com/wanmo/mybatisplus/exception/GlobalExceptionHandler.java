package com.wanmo.mybatisplus.exception;


        import com.wanmo.mybatisplus.common.Result;
        import org.springframework.web.bind.annotation.ExceptionHandler;
        import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 全局异常处理类
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public Result error(Exception e) {
        e.printStackTrace();
        return Result.fail(e);
    }

    @ExceptionHandler(MyException.class)
    public Result error(MyException e) {
        e.printStackTrace();
        return Result.fail(e);
    }

}
