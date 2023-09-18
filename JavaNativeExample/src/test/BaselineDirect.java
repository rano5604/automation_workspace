package test;
import java.nio.ByteBuffer;
public class BaselineDirect {
  private static ByteBuffer humonguosBuffer = ByteBuffer.allocateDirect(1024*1024*1024);
  public static void main(String[] args) throws Exception {
    System.out.println("Direct allocation: " + humonguosBuffer.capacity());
   // System.out.println("Native memory used: " + sun.misc.SharedSecrets.getJavaNioAccess().getDirectBufferPool().getMemoryUsed());
   // System.out.println("Max direct memory: " + sun.misc.VM.maxDirectMemory());
    Thread.sleep(1000000);
  }
}