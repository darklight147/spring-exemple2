package iir4.g5.cours.springexemple2.repository;


import java.util.List;

public interface ProjectRepository <T> {
    void ajouter(T project);

    void modifier(T project);

    void supprimer(int idProject);

    List<T> get();

    T get(int T);
}
