"""
Development runner for the Flask app. This is a small, non-invasive helper to start
the app with the correct python path for local dev/testing. It is NOT used by production.

Usage (Powershell):
  python .\run_dev.py

This script does not modify application source; it only adjusts sys.path at runtime.
"""
import os
import sys

HERE = os.path.dirname(os.path.abspath(__file__))
# Add the inner App folder to sys.path so imports resolve correctly
INNER_APP = os.path.join(HERE, 'App')
if INNER_APP not in sys.path:
  sys.path.insert(0, INNER_APP)

# Import app directly from App.py (not as App.App)
import App as app_module
app = app_module.app

if __name__ == '__main__':
    # Bind to localhost by default for quick dev testing
    # use_reloader=False prevents import errors on file changes
    app.run(host='127.0.0.1', port=5000, debug=True, use_reloader=False)
