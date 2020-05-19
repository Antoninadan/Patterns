package ua.i.mail100.strategy.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class User {

    /**
     * Форматтер - статичный, ибо ни к чему дублировать его
     * для каждого пользователя 
     */
    private static final DateFormat df = new SimpleDateFormat("dd.MM.yyyy");

    private Integer id;
    private String fio;
    private Date regDate;

    public User(Integer id, String fio, Date date) {
        this.id = id;
        this.fio = fio;
        this.regDate = date;
    }

    public String getFio() {
        return fio;
    }

    public Integer getID() {
        return id;
    }

    public Date getRegDate() {
        return regDate;
    }

    @Override
    public int hashCode() {
        final Integer PRIME = 31;
        Integer result = 1;
        result = PRIME * result + id;
        result = PRIME * result + ((fio == null) ? 0 : fio.hashCode());
        result = PRIME * result + ((regDate == null) ? 0 : regDate.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof User))
            return false;

        final User other = (User) obj;
        if (id != other.id)
            return false;
        if (fio == null) {
            if (other.fio != null)
                return false;
        } else if (!fio.equals(other.fio))
            return false;
        if (regDate == null) {
            if (other.regDate != null)
                return false;
        } else if (!regDate.equals(other.regDate))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return id
                + " " + fio + " "
                + df.format(regDate) + "  ";
    }

}