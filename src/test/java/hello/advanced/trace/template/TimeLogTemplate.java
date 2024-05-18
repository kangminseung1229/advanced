package hello.advanced.trace.template;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TimeLogTemplate {

    public void execute(CallBack callBack){
        long start = System.currentTimeMillis();

        callBack.call();

        long endTime = System.currentTimeMillis();
        long result = endTime - start;
        log.info("resultTime={}", result);
    }
}
