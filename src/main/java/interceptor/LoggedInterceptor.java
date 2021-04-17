package interceptor;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Interceptor
@Logged
public class LoggedInterceptor {

    @AroundInvoke
    public Object logEntryToTheMethod(InvocationContext ctx) throws Exception {
        System.out.println("Method " + ctx.getMethod() + " was called");
        return ctx.proceed();
    }
}
