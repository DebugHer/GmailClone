package com.example.aadegoke.gmailclone.model;

/**
 * Created by a.adegoke on 6/8/2018.
 */

public class Message
        {
            private int id;
            private String from;
            private String subject;
            private String message;
            private String timestamp;
            private String picture;
            private boolean isImportant;
            private boolean isRead;
            private int color = -1;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getFrom() {
                return from;
            }

            public void setFrom(String from) {
                this.from = from;
            }

            public String getSubject() {
                return subject;
            }

            public void setSubject(String subject) {
                this.subject = subject;
            }

            public String getMessage() {
                return message;
            }

            public void setMessage(String message) {
                this.message = message;
            }

            public String getTimestamp() {
                return timestamp;
            }

            public void setTimestamp(String timestamp) {
                this.timestamp = timestamp;
            }

            public String getPicture() {
                return picture;
            }

            public void setPicture(String picture) {
                this.picture = picture;
            }

            public boolean isImportant() {
                return isImportant;
            }

            public void setImportant(boolean important) {
                isImportant = important;
            }

            public boolean isRead() {
                return isRead;
            }

            public void setRead(boolean read) {
                isRead = read;
            }

            public int getColor() {
                return color;
            }

            public void setColor(int color) {
                this.color = color;
            }

            public Message(int id, String from, String subject, String message, String timestamp, String picture, boolean isImportant, boolean isRead, int color) {

                this.id = id;
                this.from = from;
                this.subject = subject;
                this.message = message;
                this.timestamp = timestamp;
                this.picture = picture;
                this.isImportant = isImportant;
                this.isRead = isRead;
                this.color = color;
            }
        }
