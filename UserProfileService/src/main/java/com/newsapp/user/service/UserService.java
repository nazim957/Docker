package com.newsapp.user.service;

import com.newsapp.user.exception.SecurityMismatchException;
import com.newsapp.user.exception.UserAlreadyExistException;
import com.newsapp.user.exception.UserNotFoundException;
import com.newsapp.user.model.ForgotPassword;
import com.newsapp.user.model.User;

public interface UserService {
    User registerUser(User user) throws UserAlreadyExistException;

//    User findByIdAndPassword(String id, String password) throws UserNotFoundException;
    boolean updatePassword(String email, ForgotPassword forgotPassword) throws SecurityMismatchException, UserNotFoundException;
}
