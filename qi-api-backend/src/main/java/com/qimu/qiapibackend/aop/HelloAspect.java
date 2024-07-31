package com.qimu.qiapibackend.aop;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.date.TimeInterval;
import com.qimu.qiapibackend.common.ResultData;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
public class HelloAspect {

    @Pointcut("execution(public * com.qimu.qiapibackend.controller..*.*(..) throws Exception)")
    public void pointcut() {
    }

    @Before("pointcut()")
    public void before(JoinPoint point){
        log.info("前置通知");
    }

    @After("pointcut()")
    public void after(JoinPoint point) {
        log.info("后置通知");
    }

    @Around("pointcut()")
    public Object around(ProceedingJoinPoint joinPoint) {
        log.info("环绕通知");
        try {
            // 计时
            TimeInterval timer = DateUtil.timer();
            // 执行方法，连接点
            Object result = joinPoint.proceed();
            // 查看耗时
            log.info("耗时：{}", timer.interval());
            return result;
        } catch (Throwable throwable) {
            return ResultData.fail("服务器繁忙，请稍后再试");
        }
    }

    @AfterReturning("pointcut()")
    public void afterReturning(JoinPoint point) {
        log.info("返回通知");
    }

    @AfterThrowing(value = "pointcut()", throwing = "t")
    public void afterThrowing(JoinPoint point, Throwable t) {
        log.info("异常通知");
    }

}
