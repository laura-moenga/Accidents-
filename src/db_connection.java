public static void main(String[] args) {
    System.out.println("Testing database connection...");
    Connection conn = getConnection();
    if (conn != null) {
        System.out.println("Connection test successful!");
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    } else {
        System.out.println("Connection test failed!");
    }
}