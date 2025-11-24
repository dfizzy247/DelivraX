# 🤝 Contributing to DelivraX

Thank you for your interest in contributing to DelivraX! This document provides guidelines and instructions for contributing to the project.

---

## 📋 Table of Contents

- [Code of Conduct](#code-of-conduct)
- [Getting Started](#getting-started)
- [Development Setup](#development-setup)
- [How to Contribute](#how-to-contribute)
- [Coding Standards](#coding-standards)
- [Commit Guidelines](#commit-guidelines)
- [Pull Request Process](#pull-request-process)

---

## 📜 Code of Conduct

### Our Pledge

We are committed to providing a welcoming and inclusive environment for all contributors.

### Our Standards

**Positive behavior includes:**
- Using welcoming and inclusive language
- Being respectful of differing viewpoints
- Gracefully accepting constructive criticism
- Focusing on what is best for the community

**Unacceptable behavior includes:**
- Harassment, trolling, or derogatory comments
- Publishing others' private information
- Other conduct which could reasonably be considered inappropriate

---

## 🚀 Getting Started

### Prerequisites

- Python 3.8+
- MySQL 8.0+
- Git
- Android Studio (for mobile development)
- Basic knowledge of Flask, JavaScript, and Android

### Fork the Repository

1. Fork the repository on GitHub
2. Clone your fork locally:
   ```bash
   git clone https://github.com/YOUR_USERNAME/DelivraX.git
   cd DelivraX
   ```
3. Add upstream remote:
   ```bash
   git remote add upstream https://github.com/dfizzy247/DelivraX.git
   ```

---

## 💻 Development Setup

### Backend Setup

```bash
# Navigate to backend
cd API-and-Admin-Panel/App

# Create virtual environment
python -m venv venv
source venv/bin/activate  # On Windows: venv\Scripts\activate

# Install dependencies
pip install -r requirements.txt

# Set up database
mysql -u root -p delivrax < ../../scripts/setup-complete.sql

# Create .env file
cp .env.example .env
# Edit .env with your database credentials

# Run development server
python run_dev.py
```

### Android Setup

```bash
# Open in Android Studio
cd Drivers-Android-App
# File → Open → Select Drivers-Android-App folder

# Sync Gradle
# Build → Make Project

# Run on emulator
# Run → Run 'app'
```

---

## 🎯 How to Contribute

### Types of Contributions

We welcome:
- 🐛 Bug fixes
- ✨ New features
- 📝 Documentation improvements
- 🎨 UI/UX enhancements
- ⚡ Performance improvements
- ✅ Test coverage
- 🌐 Translations

### Finding Issues

- Check [Issues](https://github.com/dfizzy247/DelivraX/issues) for open tasks
- Look for `good first issue` or `help wanted` labels
- Comment on an issue to claim it

### Reporting Bugs

**Before reporting:**
- Check if the bug has already been reported
- Verify it's reproducible on the latest version

**Bug report should include:**
- Clear, descriptive title
- Steps to reproduce
- Expected vs actual behavior
- Screenshots (if applicable)
- Environment details (OS, Python version, etc.)

**Template:**
```markdown
**Describe the bug**
A clear description of what the bug is.

**To Reproduce**
1. Go to '...'
2. Click on '...'
3. See error

**Expected behavior**
What you expected to happen.

**Screenshots**
If applicable, add screenshots.

**Environment:**
- OS: [e.g., Windows 10]
- Python: [e.g., 3.8.5]
- Browser: [e.g., Chrome 95]
```

### Suggesting Features

**Feature request should include:**
- Clear, descriptive title
- Detailed description of the feature
- Use cases and benefits
- Possible implementation approach
- Mockups or examples (if applicable)

---

## 📏 Coding Standards

### Python (Backend)

**Follow PEP 8:**
```python
# Good
def calculate_delivery_cost(distance, weight):
    """Calculate delivery cost based on distance and weight."""
    base_rate = 5.00
    per_km = 0.50
    per_kg = 0.20
    return base_rate + (distance * per_km) + (weight * per_kg)

# Bad
def calc(d,w):
    return 5+d*0.5+w*0.2
```

**Key rules:**
- Use 4 spaces for indentation
- Maximum line length: 79 characters
- Use descriptive variable names
- Add docstrings to functions
- Use type hints where appropriate

### JavaScript (Frontend)

**ES5 compatible:**
```javascript
// Good
function handleSubmit(event) {
    event.preventDefault();
    var formData = {
        name: $('#name').val(),
        email: $('#email').val()
    };
    sendData(formData);
}

// Avoid ES6+ (project uses jQuery 2.2.3)
const handleSubmit = (e) => {
    e.preventDefault();
    const {name, email} = getFormData();
};
```

**Key rules:**
- Use `var` instead of `let`/`const`
- Use function declarations, not arrow functions
- Use jQuery for DOM manipulation
- Add comments for complex logic

### Java (Android)

**Follow Android conventions:**
```java
// Good
public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private TextView textView;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeViews();
    }
    
    private void initializeViews() {
        textView = findViewById(R.id.textView);
    }
}
```

**Key rules:**
- Use camelCase for methods and variables
- Use PascalCase for classes
- Add `@Override` annotations
- Use meaningful names
- Follow Material Design guidelines

### CSS

**DelivraX brand consistency:**
```css
/* Good - Use brand variables */
.button-primary {
    background: linear-gradient(90deg, #00A2E5 0%, #7B42F6 100%);
    border-radius: 8px;
    transition: all 0.3s cubic-bezier(0.4, 0, 0.2, 1);
}

/* Bad - Hardcoded colors */
.button {
    background: blue;
    border-radius: 5px;
}
```

**Key rules:**
- Use DelivraX brand colors
- Mobile-first responsive design
- Use CSS variables for consistency
- Add vendor prefixes for compatibility

---

## 📝 Commit Guidelines

### Commit Message Format

```
<type>(<scope>): <subject>

<body>

<footer>
```

### Types

- `feat`: New feature
- `fix`: Bug fix
- `docs`: Documentation changes
- `style`: Code style changes (formatting, etc.)
- `refactor`: Code refactoring
- `test`: Adding tests
- `chore`: Maintenance tasks

### Examples

```bash
# Good commits
git commit -m "feat(api): Add driver location tracking endpoint"
git commit -m "fix(admin): Resolve date format issue in driver creation"
git commit -m "docs: Update README with Android setup instructions"
git commit -m "style(web): Apply DelivraX gradient to buttons"

# Bad commits
git commit -m "fixed stuff"
git commit -m "update"
git commit -m "changes"
```

### Emoji Commits (Optional)

```bash
git commit -m "✨ feat(api): Add real-time notifications"
git commit -m "🐛 fix(android): Resolve login authentication bug"
git commit -m "📝 docs: Update API documentation"
git commit -m "🎨 style(web): Improve gradient styling"
git commit -m "⚡ perf(api): Optimize database queries"
git commit -m "♻️ refactor(admin): Simplify modal generation"
git commit -m "✅ test(api): Add unit tests for driver endpoints"
```

---

## 🔄 Pull Request Process

### Before Submitting

1. **Update your fork:**
   ```bash
   git fetch upstream
   git checkout main
   git merge upstream/main
   ```

2. **Create a feature branch:**
   ```bash
   git checkout -b feature/amazing-feature
   ```

3. **Make your changes:**
   - Write clean, documented code
   - Follow coding standards
   - Test thoroughly

4. **Commit your changes:**
   ```bash
   git add .
   git commit -m "feat: Add amazing feature"
   ```

5. **Push to your fork:**
   ```bash
   git push origin feature/amazing-feature
   ```

### Submitting PR

1. Go to your fork on GitHub
2. Click "New Pull Request"
3. Select your feature branch
4. Fill in the PR template:

```markdown
## Description
Brief description of changes

## Type of Change
- [ ] Bug fix
- [ ] New feature
- [ ] Documentation update
- [ ] Code refactoring

## Testing
- [ ] Tested locally
- [ ] All tests pass
- [ ] No breaking changes

## Screenshots (if applicable)
Add screenshots here

## Checklist
- [ ] Code follows style guidelines
- [ ] Self-reviewed code
- [ ] Commented complex code
- [ ] Updated documentation
- [ ] No new warnings
```

### PR Review Process

1. **Automated checks** will run
2. **Maintainer review** (may request changes)
3. **Address feedback** if needed
4. **Approval** and merge

### After Merge

1. **Delete your branch:**
   ```bash
   git branch -d feature/amazing-feature
   git push origin --delete feature/amazing-feature
   ```

2. **Update your fork:**
   ```bash
   git checkout main
   git pull upstream main
   ```

---

## 🧪 Testing

### Backend Tests

```bash
# Run Python tests (when implemented)
cd API-and-Admin-Panel/App
python -m pytest tests/
```

### Frontend Tests

```bash
# Manual testing checklist
- [ ] Admin login works
- [ ] CRUD operations function
- [ ] Dashboard displays correctly
- [ ] Responsive on mobile
- [ ] No console errors
```

### Android Tests

```bash
# Run Android tests
cd Drivers-Android-App
./gradlew test
./gradlew connectedAndroidTest
```

---

## 📚 Resources

### Documentation
- [Flask Documentation](https://flask.palletsprojects.com/)
- [Android Developer Guide](https://developer.android.com/)
- [MySQL Documentation](https://dev.mysql.com/doc/)
- [Bootstrap Documentation](https://getbootstrap.com/docs/)

### Project Docs
- [README.md](README.md) - Project overview
- [QUICK_START_GUIDE.md](QUICK_START_GUIDE.md) - Setup guide
- [DELIVRAX_BRAND_GUIDE.md](DELIVRAX_BRAND_GUIDE.md) - Design system
- [PROJECT_RULES.md](PROJECT_RULES.md) - Development rules

---

## 💬 Communication

### Getting Help

- **GitHub Issues**: For bugs and features
- **Discussions**: For questions and ideas
- **Email**: For private concerns

### Stay Updated

- Watch the repository for updates
- Star the project to show support
- Follow [@dfizzy247](https://github.com/dfizzy247)

---

## 🎉 Recognition

Contributors will be:
- Listed in CONTRIBUTORS.md
- Mentioned in release notes
- Credited in documentation

---

## 📄 License

By contributing, you agree that your contributions will be licensed under the MIT License.

---

## 🙏 Thank You!

Your contributions make DelivraX better for everyone. We appreciate your time and effort!

**Happy coding! 🚀**
