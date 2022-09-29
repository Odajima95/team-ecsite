insert into mst_category (category_name,category_description) values
("テレビ","4K有機ELテレビのカテゴリー"),
("洗濯機","洗濯機のカテゴリー"),
("冷蔵庫","冷蔵庫のカテゴリー"),
("パソコン","パソコンのカテゴリー"),
("スマートフォン","スマホのカテゴリー");

insert into mst_product (product_name,product_name_kana,product_description,category_id,price,image_full_path,release_date,release_company) values
("4K有機ELテレビ65型","ふぉーけーゆうきいーえるてれびろくじゅうごがた","高性能65型の4K有機ELテレビです。",1,200000,"/img/television/television_65.png","2021/10/01","wings社"),
("4K有機ELテレビ55型","ふぉーけーゆうきいーえるてれびごじゅうごがた","高性能55型の4K有機ELテレビです。",1,250000,"/img/television/television_55.jpeg","2021/10/01","wings社"),
("4K有機ELテレビ43型","ふぉーけーゆうきいーえるてれびよんじゅうさんがた","高性能43型の4K有機ELテレビです。",1,300000,"/img/television/television_43.png","2021/10/01","wings社"),
("ドラム式洗濯機","どらむしきせんたくき","取り出しやすいドラム式の洗濯機です。",2,300000,"/img/washingmachine/washingmachine_drum.jpeg","2022/04/01","wings社"),
("縦型洗濯機","たてがたせんたくき","シンプルな縦型洗濯機です。",2,150000,"/img/washingmachine/washingmachine_vertical.jpeg","2022/04/01","wings社"),
("冷蔵庫(白)","れいぞうこ(しろ)","シンプルな白い冷蔵庫です。",3,200000,"/img/fridge/fridge_white.jpeg","2022/05/01","wings社");

insert into mst_product (product_name,product_name_kana,product_description,category_id,price,image_full_path,release_date,release_company) values
("冷蔵庫(黒)","れいぞうこ(くろ)","スタイリッシュな黒い冷蔵庫です。",3,200000,"/img/fridge/fridge_black.jpeg","2022/05/01","wings社"),
("ノートパソコン","のーとぱそこん","コンパクトなノートパソコンです。",4,200000,"/img/pc/pc_note.jpeg","2022/04/01","wings社"),
("デスクトップパソコン","ですくとっぷぱそこん","高性能なデスクトップパソコンです。",4,250000,"/img/pc/pc_desktop.jpeg","2022/04/01","wings社"),
("スマホ(白)","すまほ(しろ)","シンプルで高性能なスマートフォンです。",5,150000,"/img/smartphone/smartphone_white.jpeg","2022/08/01","wings社");

insert into mst_product (product_name,product_name_kana,product_description,category_id,price,image_full_path,release_date,release_company) values
("スマホ(黒)","すまほ(くろ)","スタイリッシュで高性能なスマートフォンです。",5,150000,"/img/smartphone/smartphone_black.jpeg","2022/08/01","wings社");

insert into mst_user (user_name,password,family_name,first_name,family_name_kana,first_name_kana,gender)
values("yamadataro@aaa.aaa","taropw","山田","太郎","やまだ","たろう",0);
