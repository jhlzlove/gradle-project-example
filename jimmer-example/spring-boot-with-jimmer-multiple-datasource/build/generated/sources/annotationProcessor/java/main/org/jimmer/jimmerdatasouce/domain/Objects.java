package org.jimmer.jimmerdatasouce.domain;

import org.babyfish.jimmer.DraftConsumer;
import org.babyfish.jimmer.internal.GeneratedBy;

@GeneratedBy
public interface Objects {
    static Course createCourse(DraftConsumer<CourseDraft> block) {
        return CourseDraft.$.produce(block);
    }

    static Course createCourse(Course base, DraftConsumer<CourseDraft> block) {
        return CourseDraft.$.produce(base, block);
    }

    static Dept createDept(DraftConsumer<DeptDraft> block) {
        return DeptDraft.$.produce(block);
    }

    static Dept createDept(Dept base, DraftConsumer<DeptDraft> block) {
        return DeptDraft.$.produce(base, block);
    }

    static Role createRole(DraftConsumer<RoleDraft> block) {
        return RoleDraft.$.produce(block);
    }

    static Role createRole(Role base, DraftConsumer<RoleDraft> block) {
        return RoleDraft.$.produce(base, block);
    }

    static Student createStudent(DraftConsumer<StudentDraft> block) {
        return StudentDraft.$.produce(block);
    }

    static Student createStudent(Student base, DraftConsumer<StudentDraft> block) {
        return StudentDraft.$.produce(base, block);
    }
}
