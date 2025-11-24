"""
Database extensions. In development mode without MySQL, this provides a mock implementation.
For production, you can replace this with the actual Flask-MySQLdb.
"""

class MockMySQL:
    """Mock MySQL class for testing without a real database connection."""
    def init_app(self, app):
        pass
    
    def get_db(self):
        return None

# Try to use the real MySQL extension; fall back to mock if not available
try:
    from flask_mysqldb import MySQL
except ImportError:
    try:
        from flask_mysql import MySQL
    except ImportError:
        MySQL = MockMySQL

mysql = MySQL()
