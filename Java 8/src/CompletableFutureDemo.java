import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> completableFuture=new CompletableFuture<>();
        completableFuture.get();
        completableFuture.complete("return some dummy data");
    }
}
