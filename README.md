
# 📦 DbArray – Dynamic Stack-Like Array Structure in Java

`DbArray` is a simple custom data structure written in Java, designed to store objects dynamically in a way similar to a stack. It supports dynamic resizing and allows you to push objects with predefined fields (`name`, `age`) into an internal array.

---

## 🚀 Features

- Stores multiple `DbArray` objects inside itself.
- Dynamically expands the array as new items are pushed.
- Custom object structure with fields: `name`, `age`.
- `printStack()` method to view all pushed objects.

---

## 🧪 Usage

### ✅ Basic Usage Example

```java
DbArray db = new DbArray();

db.pushData("Alice", 22);
db.pushData("Bob", 24);
db.printStack();
```

**Output:**
```
----- Stack Contents -----
Name: Alice
 Age: 22
Name: Bob
 Age: 24
--------------------------
```

---

## 🛠️ How to Add More Fields (e.g., Email, Phone)

Let's say you want to add two new fields: `email` and `phone`. Here's what you need to modify:

### 🔧 Step-by-Step Modifications

#### 1. Add new private variables:
```java
private String email;
private String phone;
```

#### 2. Update the constructor:
```java
private DbArray(String name, int age, String email, String phone) {
    this.name = name;
    this.age = age;
    this.email = email;
    this.phone = phone;
}
```

#### 3. Update `pushData()` method:
```java
public void pushData(String name, int age, String email, String phone) {
    if (top >= dtArray.length) {
        DbArray[] temp = new DbArray[dtArray.length + 1];
        for (int i = 0; i < dtArray.length; i++) {
            temp[i] = dtArray[i];
        }
        dtArray = temp;
    }

    this.dtArray[top++] = new DbArray(name, age, email, phone);
}
```

#### 4. Update the `printStack()` method:
```java
System.out.println("Name: " + dtArray[i].name);
System.out.println("Age: " + dtArray[i].age);
System.out.println("Email: " + dtArray[i].email);
System.out.println("Phone: " + dtArray[i].phone);
```

---

## 📁 Class Structure Summary

- `DbArray()`: Initializes internal storage.
- `pushData(...)`: Pushes new object, resizes array if needed.
- `printStack()`: Prints all pushed objects.

---

## 📌 Notes

- This is a learning example and not thread-safe or optimized for production.
- The internal array grows by 1 on each push beyond capacity (can be improved with doubling strategy for better performance).
- Encapsulation can be improved by using getter/setter methods.
