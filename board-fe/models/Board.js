export class Board {
    id;
    name;
    contents;
    createdAt;
    createdBy;
    modifiedAt;
    modifiedBy;
    userId;

    constructor({id, name, contents, createdAt, createdBy, modifiedAt, modifiedBy, userId} = {}) {
        this.id = id;
        this.name = name;
        this.contents = contents;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.modifiedAt = modifiedAt;
        this.modifiedBy = modifiedBy;
        this.userId = userId;
    }
}