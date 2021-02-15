package ru.netology.data;

import com.github.javafaker.Faker;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Locale;

@Data
@RequiredArgsConstructor
public class DataUser {
    private String name;
    private String phone;

    Faker faker = new Faker(new Locale("ru"));

    public String dataName() {
        name = faker.name().fullName();
        return name;
    }

    public String dataPhone() {
        phone = faker.phoneNumber().phoneNumber();
        return phone;
    }
}
