package org.launchcode.codingevents.models;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * Created by Chris Bay
 */
public class Event {

    private int id;
    private static int nextId = 1;

    @NotBlank(message = "Name is required")
    @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters")
    private String name;

    @Size(max = 500, message = "Description too long!")
    private String description;

    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email. Try again.")
    private String contactEmail;

    @NotBlank(message = "Address is required.")
    private String address;

    private String isRegistrationRequired;

    @Size(min = 1, message = "Number of attendees should be 1 and above")
    private String numberOfAttendees;

    @NotEmpty
    private String sponsor;

    private EventType type;

    public Event(String name, String description, String contactEmail, String address, String isRegistrationRequired,
                 String numberOfAttendees, String sponsor, EventType type) {
        this();
        this.name = name;
        this.description = description;
        this.contactEmail = contactEmail;
        this.address = address;
        this.isRegistrationRequired = isRegistrationRequired;
        this.numberOfAttendees = numberOfAttendees;
        this.sponsor = sponsor;
        this.type = type;
    }

    public Event() {
        this.id = nextId;
        nextId++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public int getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getIsRegistrationRequired() {
        return isRegistrationRequired;
    }

    public void setRegistrationRequired(String registrationRequired) {
        isRegistrationRequired = registrationRequired;
    }

    public String getNumberOfAttendees() {
        return numberOfAttendees;
    }

    public void setNumberOfAttendees(String numberOfAttendees) {
        this.numberOfAttendees = numberOfAttendees;
    }

    public String getSponsor() {
        return sponsor;
    }

    public void setSponsor(String sponsor) {
        this.sponsor = sponsor;
    }

    public EventType getType() {
        return type;
    }

    public void setType(EventType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return id == event.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
