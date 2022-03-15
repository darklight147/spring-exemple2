package iir4.g5.cours.springexemple2.services;

import iir4.g5.cours.springexemple2.models.Project;

import java.util.List;

public interface ProjectService <T> {
    void ajouter (T o);

    void modifier(T o);

    void supprimer(int id);

    List<T> get();

    T get(int id);
}
