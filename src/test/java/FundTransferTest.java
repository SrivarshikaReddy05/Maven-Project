import org.junit.jupiter.api.Test;
import com.app.process.Account;
import static org.junit.jupiter.api.Assertions.*;

public class FundTransferTest {

    // ✅ Test 1: Successful transfer
    @Test
    public void testSuccessfulTransfer() {
        Account from = new Account("A101", "Alice", 1000.0);
        Account to = new Account("B202", "Bob", 500.0);

        boolean result = from.transfer(from, to, 200);

        assertTrue(result); // should pass
        assertEquals(800, from.getBalance());
        assertEquals(700, to.getBalance());
    }

    // ✅ Test 2: Insufficient funds
    @Test
    public void testInsufficientFunds() {
        Account from = new Account("A101", "Alice", 100.0);
        Account to = new Account("B202", "Bob", 500.0);

        boolean result = from.transfer(from, to, 200);

        assertFalse(result); // corrected: should be false because funds are insufficient
        assertEquals(100, from.getBalance()); // balance unchanged
        assertEquals(500, to.getBalance());   // balance unchanged
    }

    // ✅ Test 3: Invalid amount
    @Test
    public void testInvalidAmount() {
        Account from = new Account("A101", "Alice", 1000.0);
        Account to = new Account("B202", "Bob", 500.0);

        boolean result = from.transfer(from, to, -50);
        assertFalse(result); // invalid amount → false
    }

    // ✅ Test 4: Null accounts
    @Test
    public void testNullAccounts() {
        Account from = new Account("A101", "Alice", 1000.0);

        boolean result = from.transfer(null, null, 100);
        assertFalse(result); // corrected: should be false since accounts are null
    }
}
