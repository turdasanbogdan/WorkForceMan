package com.example.demo.repositories;

import com.example.demo.entities.Skill;
import org.springframework.data.jpa.domain.Specification;

public class SkillSpecifications{



//    public static Specification<Skill> getSkillByName(String name) {
//        return new Specification<Skill>() {
//            @Override
//            public Predicate toPredicate(Root<Skill> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
//                Predicate equalPredicate = criteriaBuilder.equal(root.get(Skill_.name), name);
//                return equalPredicate;
//            }
//        };
//    }

    public static Specification<Skill> getSkillsByName(String name){
        return (skill, cq, cb) -> cb.equal(skill.get("name"), name);
    }

    public static Specification<Skill> getSkillsByCategory(String category){
        return (skill, cq, cb) -> cb.equal(skill.get("category"), category);
    }

    public static Specification<Skill> getSkillsByRating(int rating){
        return (skill, cq, cb) -> cb.equal(skill.get("rating"), rating);
    }
//    public static Specification<Skill> getSkillByCategory(String category) {
//        return new Specification<Skill>() {
//            @Override
//            public Predicate toPredicate(Root<Skill> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
//                Predicate equalPredicate = criteriaBuilder.equal(root.get(Skill_.category), category);
//                return equalPredicate;
//            }
//        };
//    }
//
//    public static Specification<Skill> getSkillByRating(int rating) {
//        return new Specification<Skill>() {
//            @Override
//            public Predicate toPredicate(Root<Skill> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
//                Predicate equalPredicate = criteriaBuilder.equal(root.get(Skill_.rating), rating);
//                return equalPredicate;
//            }
//        };
//    }


}