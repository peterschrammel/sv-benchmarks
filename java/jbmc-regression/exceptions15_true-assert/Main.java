class InetAddress {}
class InetSocketAddress {}

public class Main {
  public String lookupPtrRecord(InetAddress address) {
    return "Foo";
  }

  public InetAddress reverse(InetAddress address) {
    return address;
  }

  public void main(String[] args) {
    try {
      InetAddress address = new InetAddress();
      int i = args.length;
      String domainName = lookupPtrRecord(reverse(address));
    } catch (Exception e) {
      assert false;
    }
  }
}
