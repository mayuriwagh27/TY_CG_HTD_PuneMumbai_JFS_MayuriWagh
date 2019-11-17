export class Product {
    constructor(
        public productName: string,
        public productCat: string,
        public price: number,
        public detail: string,
        public imgURL: string,
        public pk ?: string

    ) {}
}
